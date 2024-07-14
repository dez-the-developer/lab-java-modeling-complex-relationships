package com.ironhack.modelingcomplexrelationships.nurse_association;

import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NurseAssociationApplication {
	public static void main(String[] args) {
		SpringApplication.run(Member.NurseAssociationApplication.class, args);
	}
}
