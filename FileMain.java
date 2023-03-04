package project;

import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class FileMain {

	public static void main(String[] args) throws IOException {
		//Application and Developer Details
		final String pathName = "C:\\File";
		System.out.println("Application Name : File Manager" + "\n");
		System.out.println("Developer Details :" + "\n" + "Name: Shreyansh Shrey" + "\n" + "  Java Developer   " + "\n");
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{	
		//Displaying options for user interaction	
		System.out.println("1: Retreive File Names in Ascending Order" + "\n" + "2: Business-level Operations" + "\n" + "3: Close the Application" + "\n");
		System.out.println("Enter Your Choice");
		System.out.println("Hi ShreyTest");
		System.out.println("Hi ShreyTest23");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : //Displaying file names in sorted way
				File fileDir = new File(pathName);
				if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				Collections.sort(listFile);
				System.out.println("Sorting by filename in ascending order");
				for(String s:listFile){
					System.out.println(s);
				}
				}
				else{
					System.out.println(" is not a directory");
				}

				break;
		case 2 : //Displaying operations for user
			int ichoice;
			do
			{
				System.out.println("1: Add File" + "\n" + "2: Delete File" + "\n" + "3: Search File" + "\n" + "4: Return to Main Menu" + "\n");
				System.out.println("Enter Your Choice");
				ichoice = sc.nextInt();
				switch(ichoice)
				{
				case 1: //Add File
						System.out.println("Enter File Name to Add");
						String addname = sc.next();
						addname = addname + ".txt";
						File file = new File(pathName + "\\" + addname);
						file.createNewFile();
						System.out.println("File added successfully"); 
						break;
				case 2: //Delete File
						System.out.println("Enter File Name to Delete");
						String deletename = sc.next();
						deletename = deletename + ".txt";
						file = new File(pathName + "\\" + deletename);
						File directoryD = new File(pathName);
						String[] fdel = directoryD.list();
						int chk = 0;
						for (int i = 0; i < fdel.length; i++) 
						{
			                String fileDelete = fdel[i];
			                if (fileDelete.equals(deletename)) 
			                {
			                	file.delete();
			                    System.out.println(fileDelete + " Deleted");
			                    chk = 1;
			                }
						}
						if(chk == 0)
						{
							System.out.println("File Not Found");
						}
						
						break;
				case 3: //Search File
						System.out.println("Enter File Name to Search");
						String searchname = sc.next();
						searchname = searchname + ".txt";
						File directory = new File(pathName);
						String[] flist = directory.list();
						int check = 0;
						//Linear search in the array
						for (int i = 0; i < flist.length; i++) 
						{
			                String filename = flist[i];
			                if (filename.equals(searchname)) 
			                {
			                    System.out.println(filename + " Found");
			                    check = 1;
			                }
						}
						if(check == 0)
						{
							System.out.println("File Not Found");
						}
						break;
						
				case 4: //Exit
						break;
				
				default:
					 System.out.println("\nInvalid option. Please select again.");
					 break;
				}
				//break;
			}while(ichoice != 4);
			break;
		case 3 : //Exit the Application
				System.out.println("Thanks for Using the Application");
				System.exit(0);
		
		default:
			 System.out.println("\nInvalid option. Please select again.");
			 break;
		}
		}
	}

}
