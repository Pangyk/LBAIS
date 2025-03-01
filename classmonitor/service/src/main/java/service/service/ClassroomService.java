package service.service;

import java.util.List;

import service.entity.Classroom;
import service.vo.StudentInfoVO;

public interface ClassroomService {

	public List<Classroom> findAllClassesByteacher(String uid);

	public List<Classroom> findAllClasses();
	
	public Classroom getInfo(int id);
	
	public void addOne(String cname,String teacher,int num,String grade,String date);
	
	public void updateOne(int id, String cname,String teacher,int num,String grade,String date);
	
	public void deleteOne(int id);

	public List<StudentInfoVO> getStudentInfoList(int cid);

	public List<StudentInfoVO> getStudentInfoBySimpleFilter(int cid, String problem);

	public List<StudentInfoVO> getStudentInfoByAdvancedFilter(int cid);

	public double getClassLivenessRate(int cid,String date);
	public double getClassAttendenceRate(int cid,String date);
	public int getClassEvent(int cid,String date);
	public void leaveForApproval(int cid,int sid,String date,int tid,int reason);
}
