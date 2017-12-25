package com.zhaoyou.web;

import com.zhaoyou.domain.CustomerRepository;
import com.zhaoyou.web.view.CsvView;
import com.zhaoyou.web.view.ExcelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhaoyou on 21/12/2017.
 */
@Controller
public class Export {

    @Autowired
    private CustomerRepository repository;

    /**
     * Handle request to download an Excel document
     */
    @RequestMapping(value = "/download/excel", method = RequestMethod.GET)
    public ModelAndView downloadExcel(Model model) {
        model.addAttribute("users", repository.getUserList());
        return new ModelAndView(new ExcelView());
    }

    @RequestMapping(value = "/download/pdf", method = RequestMethod.GET)
    public ModelAndView downloadPdf(Model model) {
        model.addAttribute("users", repository.getUserList());
        return new ModelAndView(new PdfView());
    }

    @RequestMapping(value = "/download/csv", method = RequestMethod.GET)
    public ModelAndView downloadCsv(Model model) {
        model.addAttribute("users", repository.getUserList());
        return new ModelAndView(new CsvView());
    }
}
