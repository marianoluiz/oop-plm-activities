package class_functions;

// Number 1 - Encapsulation
public class StudentGrade {
  private String strLastName;
  private String strFirstName;
  private String strStudentNo;
  private String strEmailAddress;
  private String strCellPhoneNo;
  private int intCourseGrade;
  private String strSubjectCode;

  //strLastName
  public void setstrlastname(String strLastName) {
    this.strLastName = strLastName;
  }

  public String getstrlastname() {
    return strLastName;
  }
  
  //strFirstName
  public void setstrfirstname(String strFirstName) {
    this.strFirstName = strFirstName;
  }

  public String getstrfirstname() {
    return strFirstName;
  }

  //strStudentNo
  public void setstrstudentno(String strStudentNo) {
    this.strStudentNo = strStudentNo;
  }

  public String getstrstudentno() {
    return strStudentNo;
  }

  //strEmailAddress
  public void setemailaddress(String strEmailAddress) {
    this.strEmailAddress = strEmailAddress;
  }

  public String getemailaddress() {
    return strEmailAddress;
  }

  //strCellPhoneNo
  public void setstrcellphoneno(String strCellPhoneNo) {
    this.strCellPhoneNo = strCellPhoneNo;
  }

  public String getstrcellphoneno() {
    return strCellPhoneNo;
  }

  //intCourseGrade
  public void setintcoursegrade(int intCourseGrade) {
    this.intCourseGrade = intCourseGrade;
  }

  public int getintcoursegrade() {
    return intCourseGrade;
  }

  // strSubjectCode
  public void setstrsubjectcode(String strSubjectCode) {
    this.strSubjectCode = strSubjectCode;
  }

  public String getstrsubjectcode() {
    return strSubjectCode;
  }
}
