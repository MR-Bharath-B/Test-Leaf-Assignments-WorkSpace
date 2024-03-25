package week1.day1;

public class Student {
	public static void main(String[] args) {
	String studentName="BHARATH B";
	int rollNo=20240315;
	String collegeName="M.N.M JAIN ENGINEERING COLLEGE, THORAIPAKKAM, CHENNAI-600097.";
	int languageMark=89;
	int pythonMark=90;
	int physicsMark=86;
	int mathsMark=79;
	int engineeringGraphicsMark=92;
	int chemistryMark=88;
	float cgpa=8.34f;
		System.out.println("STUDENT NAME :  "+ studentName);
		System.out.println("ROLL NO      :  "+ rollNo);
		System.out.println("COLLEGE NAME :  "+ collegeName);
		System.out.println("");
		System.out.println("-----------SUBJECT MARKS-----------");
		System.out.println("COMMUNICATIVE ENGLISH : " + languageMark);
		System.out.println("PYTHON PROGRAMMING    : " + pythonMark);
		System.out.println("ENGINEERING PHYSICS   : " + physicsMark);
		System.out.println("ENGINEERING MATHS     : " + mathsMark);
		System.out.println("ENGINEERING GRAPHICS  : " + engineeringGraphicsMark);
		System.out.println("ENGINEERING CHEMISTRY : " + chemistryMark);
		System.out.println("--------TOTAL C.G.P.A = "+ cgpa+"--------");
	}

}
