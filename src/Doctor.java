public class Doctor {
    public String DoctorName;
    public String DoctorSpecailization;
    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorSpecailization() {
        return DoctorSpecailization;
    }

    public void setDoctorSpecailization(String doctorSpecailization) {
        DoctorSpecailization = doctorSpecailization;
    }

        public Doctor(String DoctorName,String DoctorSpecailization){
            this.DoctorName=DoctorName;
            this.DoctorSpecailization=DoctorSpecailization;
        }

    public  void ToString(){
        System.out.print("Doctor_Name: "+ DoctorName);
        System.out.println("Doctor_ Specialization: "+ DoctorSpecailization);
    }
}
