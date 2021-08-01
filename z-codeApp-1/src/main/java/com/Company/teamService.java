package com.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class teamService {
	
	@Autowired
    private teamRepository teamrepo;
	
	public List<Teamreport> listAll() {
		return teamrepo.findAll();
    }
     
    public Teamreport save(Teamreport std) {
    	return teamrepo.save(std);
    }
     
    public Teamreport get(int token) {
        return teamrepo.findById(token).get();
    }
     
    public void delete(int token) {
    	teamrepo.deleteById(token);
    }

	public List<Teamreport> getKeyword(String key) {
		
		return teamrepo.findbyKeyword(key);
	}
}
