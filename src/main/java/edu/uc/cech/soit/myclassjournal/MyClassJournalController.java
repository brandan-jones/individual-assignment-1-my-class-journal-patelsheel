package edu.uc.cech.soit.myclassjournal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClassJournalController {
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

}
