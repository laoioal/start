package Self.pra.re.vo;

import java.sql.Time;
import java.util.Date;
import java.text.*;

public class EmpVO {
	private int eno,mgr, dno, sal, grade;
	private String name, job, sname, sdate, comm, dname, loc;
	private Date hdate;
	private Time htime;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일 ");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		sdate = form1.format(this.hdate) + form2.format(this.htime);
	}
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Date getHdate() {
		return hdate;
	}
	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}
	public Time getHtime() {
		return htime;
	}
	public void setHtime(Time htime) {
		this.htime = htime;
	}
	@Override
	public String toString() {
		return "EmpVO [eno=" + eno + ", mgr=" + mgr + ", dno=" + dno + ", sal=" + sal + ", grade=" + grade + ", name="
				+ name + ", job=" + job + ", sname=" + sname + ", sdate=" + sdate + ", comm=" + comm + ", dname="
				+ dname + ", loc=" + loc + ", hdate=" + hdate + ", htime=" + htime + "]";
	}

	
	
	

}
