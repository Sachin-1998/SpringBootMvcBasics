package com.it.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
@Service
public class SeasonFinderImplService implements ISeasonFinderService {

	@Override
	public String seasonFinder() {
		//get Local system date
		LocalDate ld=LocalDate.now();
		//get current month
		int month=ld.getMonthValue();
		//b logic
		if(month>=7 && month<=9)
		{
			return "Rainy-Season::"+ld;
		}
		else if(month>=3 && month<=6)
		{
			return "Summer-Season::"+ld;
		}
		else
		{
			return "Winter-Season::"+ld;
		}
		
	}

	

}
