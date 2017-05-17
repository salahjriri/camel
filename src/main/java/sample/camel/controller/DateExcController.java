package sample.camel.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.camel.model.DateExc;
import sample.camel.service.DateExcService;

@Service("dateExcController")
public class DateExcController {
	@Autowired
	private DateExcService dateExcService;
	
	public String compareDate ()
 {
		
	LocalDateTime timePoint = LocalDateTime.now( );
	if( extractDates().toString().contains(timePoint.toLocalDate().toString())){return "date d execution modifie, debut traitement";}
	else return "listning to table";
	 
 }
    public ArrayList<String> extractDates() {
    	ArrayList<DateExc> myList = new ArrayList<DateExc>();
    	ArrayList<String> listDates = new ArrayList<String>();
        for (DateExc exct:dateExcService.findAll()) {
            myList.add(exct);
        }   
        for(DateExc items : myList)
        {
        	listDates.add(items.getExcDate().toString());
        
        }
        return  listDates;
    }
    
    

}
