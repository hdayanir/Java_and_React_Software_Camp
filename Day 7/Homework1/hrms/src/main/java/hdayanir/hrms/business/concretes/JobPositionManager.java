// github.com/hdayanir

package hdayanir.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdayanir.hrms.business.abstracts.JobPositionService;
import hdayanir.hrms.dataAccess.abstracts.JobPositionDao;
import hdayanir.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
		
	}

}