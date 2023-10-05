package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.ArrayList;
import java.util.List;

public class JournalEntryStubDAO implements IJournalEntryDAO {

    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();
    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        allJournalEntries.add(journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }
}
