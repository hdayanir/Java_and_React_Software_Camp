// github.com/hdayanir

package hdayanir.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hdayanir.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	
	
}
