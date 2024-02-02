public class AppointmentManager {
    public String Patient_Name;
    public Doctor doctor;
    public String time;
    public String Date;

    public AppointmentManager(String PatientName,Doctor Doctors,String Time,String Date){
        this.Patient_Name=PatientName;
        this.doctor=Doctors;
        this.time=Time;
        this.Date=Date;
    }
    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String patient_Name) {
        Patient_Name = patient_Name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
    public void ToString(){
        System.out.println("Patient_Name: "+Patient_Name);
        System.out.println("Doctor_Name: "+doctor.getDoctorName());
        System.out.println("Doctor_Specialization: "+doctor.getDoctorSpecailization());
        System.out.println("Time_Appointment: "+getTime());
        System.out.println("Date_Appointment: "+getDate());

    }
}
