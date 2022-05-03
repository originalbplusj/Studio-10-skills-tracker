package org.launchcode.studio10skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String openingMessage(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>"+
                "</ol>"+
                "</html>";

    }
    @GetMapping("form")
    public String createForm(){
        String html =

                        "<html>" +
                            "<form action='list' method='post'>" +
                                "<label>Name:</label>"+
                                "<input type='text' name='name'/>"+
                                "<br>"+
                                "<label>My Favorite Language:</label>"+
                                "<select name='choice1'>"+
                                    "<option value='Java'> Java</option>"+
                                    "<option value='JavaScript'>JavaScript</option>"+
                                    "<option value='Python'>Python</option>"+
                                   "</select>"+
                                   "<br>"+
                                "<label>My Second Favorite Language:</label>" +
                                "<select name='choice2'>"+
                                    "<option value='Java'>Java</option>"+
                                    "<option value='JavaScript'>JavaScript</option>"+
                                    "<option value='Python'>Python</option>"+
                                "</select>"+
                                "<br>"+
                                "<label>My Third Favorite Language:</label>"+
                                "<select name='choice3'>"+
                                    "<option value='Java'> Java</option>"+
                                    "<option value='JavaScript'>JavaScript</option>"+
                                    "<option value='Python'>Python</option>"+
                                "</select>"+
                                "<br>"+
                                "<input type='Submit'/>"+
                            "</form>"+
                        "</html>";

        return html;
    }


    @PostMapping("list")
    @ResponseBody
    public String formOutput(@RequestParam String name, @RequestParam String choice1, @RequestParam String choice2, @RequestParam String choice3){
        String html =

                        "<html>"+
                                "<h1><b>"+ name+"</b></h1>"+
                                "<table>"+
                                "<tr>" +
                                "<th></th>"+
                                "<th align='left'>Language</th>"+
                                "</tr>"+
                                "<tr>"+
                                "<th>First</th>"+
                                "<td>"+choice1+"</td>" +
                                "</tr>"+
                                "<tr>"+
                                "<th>Second</th>"+
                                "<td>"+choice2+"</td>"+
                                "</tr>"+
                                "<th>Third</th>"+
                                "<td>"+choice3+"</td>"+
                                "</tr>"+
                                "</table>"+
                                "</html>";


//                        "<html>"+
//                        "<h1>"+
//                        "<b>" + name + "</b>"+
//                        "<br>"+
//                        "<ol>"+
//                            "<li>" + choice1 + "</li>"+
//                            "<li>" + choice2 + "</li>"+
//                            "<li>" + choice3 + "</li>"+
//                        "</ol>"+
//                        "</html>";
        return html;
    }
}
