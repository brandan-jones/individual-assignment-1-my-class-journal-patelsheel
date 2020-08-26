package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

public interface IJournalService {

    void save(JournalEntry journalEntry);
    List<JournalEntry> fetchAll();
}
