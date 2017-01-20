package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.model.WorkTime;
import project.repository.WorkTimeRepository;
import project.ui_model.Result;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by JoKeR on 18.01.2017.
 */
@Controller
public class WorkTimesController {

    @Autowired
    private WorkTimeRepository workTimeRepository;

    @GetMapping("/workTime/{departmentId}")
    public String resultsList(Model model, @PathVariable(value = "departmentId") int id) {
        List<WorkTime> workTimeList = workTimeRepository.findByDepartmentId(id);
        WorkTime workTime;
        List<Result> resultsList = new ArrayList<>();
        String departmentName = new String();
        for (int i = 0; i < workTimeList.size(); i++) {
            Result result = new Result();
            workTime = workTimeList.get(i);
            result.setPersonId(workTime.getPerson().getId());
            result.setCabinet(workTime.getPerson().getCabinet());
            result.setNameInic(workTime.getPerson().getNameInic());
            result.setPosition(workTime.getPerson().getPosition());
            result.setDay1(workTime.getDay1());
            result.setDay2(workTime.getDay2());
            result.setDay3(workTime.getDay3());
            result.setDay4(workTime.getDay4());
            result.setDay5(workTime.getDay5());
            result.setDay6(workTime.getDay6());
            result.setDay7(workTime.getDay7());
            result.setDepartmentName(workTime.getDepartment().getName());
            departmentName = workTime.getDepartment().getName();
            resultsList.add(result);
        }

        int weekDay = weekday(new Date());

        model.addAttribute("departmentName", departmentName);
        model.addAttribute("resultsList", resultsList);
        model.addAttribute("weekday", weekDay);

        return "resultsList";
    }


    public int weekday(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }
}
