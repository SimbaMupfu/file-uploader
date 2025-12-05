package inc.hustles.sims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FileUploadController {

    private static String UPLOADED_FOLDER = "uploads/";

    @GetMapping("/")
    public String index() {
        return "upload";
    }


}
