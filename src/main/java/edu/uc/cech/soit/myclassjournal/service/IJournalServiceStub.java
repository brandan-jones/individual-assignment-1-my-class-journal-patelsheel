package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IJournalServiceStub implements IJournalService{

    @Autowired
    private IJournalEntryDAO journalEntryDAO;
    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
        return journalEntryDAO.save(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryDAO.fetchAll();
    }
}
