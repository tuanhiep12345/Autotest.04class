package day7;

import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
int numberofEmployees;
Scanner scanner = new Scanner(System.in);
System.out.print("so luong nhan vien : ");
numberofEmployees=scanner.nextInt();
String[] employeeNames=new String[numberofEmployees];
for(int i=0;i<numberofEmployees;i++) {
	System.out.print("Nhap ten nhan vien" + (i+1)+": ");
	employeeNames[i]=scanner.next();
}
System.out.println(" Danh sach ten nhan vien: ");
for(String name : employeeNames) {
	System.out.println(name);
}
scanner.close();
	}

}
