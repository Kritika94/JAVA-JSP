/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.annotation.MultipartConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
/**
 *
 * @author Kritika
 */
@WebServlet(urlPatterns = {"/Registerres"})
public class Registerres extends HttpServlet {
PreparedStatement pslogin;
        Connection conlogin ;
        ResultSet rs;
       
   
private static final long serialVersionUID = 1L;
	
	// location to store file uploaded 
	private static String UPLOAD_DIRECTORY="upload";

	// upload settings
	private static final int MEMORY_THRESHOLD 	= 1024 * 1024 * 3; 	// 3MB
	private static final int MAX_FILE_SIZE 		= 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE	= 1024 * 1024 * 50; // 50MB
        String dropvalue[]=new String[13];
       String URL;
        String file;
      
    StringBuilder R;
      
//         @Override
//   public void init( ){
//      // Get the file location where it would be stored.
//      UPLOAD_DIRECTORY = getServletContext().getInitParameter("file-upload"); 
//   }

	/**
	 * Upon receiving file upload submission, parses the request to read
	 * upload data and saves the file on disk.
	 */
  @Override
      protected void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        
       
    // writer.println(Cname);
      //  writer.println(type);
        
        
        
         
        //  writer.println(CCno);
        // ref=request.getHeader("referer");;
   //ref=request.getAttribute("url").toString();
                         
    //writer.print(request.getParameter("type"));
        	// checks if the request actually contains upload file
		/*if (!ServletFileUpload.isMultipartContent(request)) {
			// if not, we stop here
			writer.println("Error: Form must has enctype=multipart/form-data.");
			writer.flush();
			return;
		}*/
               
                // configures upload settings
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// sets memory threshold - beyond which files are stored in disk 
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		// sets temporary location to store files
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

		ServletFileUpload upload = new ServletFileUpload(factory);
		
		// sets maximum size of upload file
		upload.setFileSizeMax(MAX_FILE_SIZE);
		
		// sets maximum size of request (include file + form data)
		upload.setSizeMax(MAX_REQUEST_SIZE);

		// constructs the directory path to store upload file
		// this path is relative to application's directory
		String uploadPath = getServletContext().getRealPath("")+ File.separator + UPLOAD_DIRECTORY;
		
                //String uploadPath=UPLOAD_DIRECTORY;
		// creates the directory if it does not exist
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
               
                 
		try {
			// parses the request's content to extract file data
			@SuppressWarnings("unchecked")
                       //list array declaration for Fileitems where upload.parseRequest passes the context of the request of the file 
			List<FileItem> formItems = upload.parseRequest(new ServletRequestContext(request));
                              if (formItems != null && formItems.size()>0)//checks whether the file is selected or not.
                                      { 
				// iterates over form's fields
                                  int i=0;
                                               for (FileItem item : formItems) {
                                // processes only fields that are not form fields eg fileName,type,size ,path etc.
					           if (!item.isFormField() ) {
						String fileName = new File(item.getName()).getName();
                                                file=fileName;
                                                String filePath = uploadPath + File.separator + fileName;
                                                 URL=filePath;
                                                  //String fieldvalue = item.getString();
						File storeFile = new File(filePath);
                                              // writer.print(formItems);
                				// saves the file on disk
						item.write(storeFile);
                                               
                                        
                                        
                                                  // writer.println(fileName+"  ");
                                                 
                                                 }else  //process fields that are form fields eg select drop down in the form till the loop above works
                                                 {
                                                         
                                                       String fieldname =  item.getFieldName();
                                                       // writer.print(fieldname);
                                        String fieldvalue = item.getString();
                                        //writer.println(fieldvalue);
                                        dropvalue[i]=fieldvalue;// storing the fieldvalues as fetched from the textbox/dropdown
                                        
                                      //writer.println(dropvalue[i]);// writer.println(i);
                                        i++;
                                       
                                     
                                       // writer.println(URL);
                                          
                                       
                                                   } 
                                              
                                         
                                               
                                               
                                               } }
                        writer.print("hello");
                        writer.println(dropvalue[0]);
                        writer.println(dropvalue[1]);
                        writer.println(dropvalue[2]);
                        writer.println(dropvalue[3]);
                        writer.println(dropvalue[4]);
                        writer.println(dropvalue[5]);
                        writer.println(URL);
                             
                          //    if(dropvalue[0].equals(1)){writer.println("")}
                                   //  writer.print(dropvalue[i]+"  ");*/
                                       
                         
                         //writer.println(dropvalue[0]);
                        //  writer.println(Date);
                      //     request.setAttribute("deptvalue",dropvalue[2]);
                    
                              }
                
                 catch (Exception ex) {
                   //  writer.println(ex);
			//request.setAttribute("message","There was an error: You did not select any file. Please select a file.");
		// redirects client to message page
                        
		//getServletContext().getRequestDispatcher("/Show_error.jsp").forward(request,response);
                }
              
                
                
                  
                   


                  
                  
                  
                  
                 try{ 
                      
                      Class.forName("com.mysql.jdbc.Driver");     
conlogin= DriverManager.getConnection("jdbc:mysql://localhost:3306/Foodie","root","123456");  
                 String Rid=new String(dropvalue[0]);
    Rid=Rid.substring(0,3);
    
     R=new StringBuilder(Rid);
    R.insert(0,"R");
     R.append("157");
        
   
/*Random r=new Random();
for(int i=0;i<3;i++){
int n=r.nextInt(10);
   }
       
*/
pslogin = conlogin.prepareStatement("insert into Restaurant(Rname,Rmail,Rlocation,RCpwd,Rno,Lisence_url,RId,filename) values(?,?,?,?,?,?,?,?)");
 
pslogin.setString(1,dropvalue[0]);
  
pslogin.setString(2,dropvalue[2]);
pslogin.setString(3,dropvalue[3]);
    //pslogin.setString(5,Rlicense);
pslogin.setString(4,dropvalue[5]);
pslogin.setString(5,dropvalue[1]);
pslogin.setString(6,URL);
pslogin.setString(7,R.toString());
pslogin.setString(8,file);
pslogin.executeUpdate();
             conlogin.close();      
                     writer.println("hello kritika");
  request.setAttribute("message1","request generated successfully, soon registration will be acknowledged");
     writer.println("hello kritika1");
         getServletContext().getRequestDispatcher("/Restaurantreg.jsp").include(request,response);        
        //RequestDispatcher rd=request.getRequestDispatcher("MIS_HOME.jsp");
         
                  }
                                
                  catch (Exception ex) {
                       request.setAttribute("dberror","Sorry!  Sir I am getting following errors. Please check uploading data. May be you can try to same data again upload.<br>"+ex);
            getServletContext().getRequestDispatcher("/Restaurantreg.jsp").forward(request,response);
          
        }  finally {     
                
                writer.close();
            
                  }                      
                 
           
}     
                
                
                
                
                  }