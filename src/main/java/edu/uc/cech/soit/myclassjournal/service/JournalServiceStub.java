package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JournalServiceStub implements IJournalService{
    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();



    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
       allJournalEntries.add(journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}

