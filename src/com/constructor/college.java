package com.constructor;

abstract class college {
    abstract void setAcademicFee();


}
class CSE_Dept extends college{
    void setAcademicFee(){
        System.out.println("100000");

    }
}

class ME_Dept extends college{
    void setAcademicFee(){
        System.out.println("70000");

    }
}
class collegeOffice{
    public static void main(String[] args) {
        college ob_cse=new CSE_Dept();
        college ob_me=new ME_Dept();
        System.out.println("CSE Dept fee structure ");
        ob_cse.setAcademicFee();
        System.out.println("ME Dept Fee structure");
        ob_me.setAcademicFee();
    }
}