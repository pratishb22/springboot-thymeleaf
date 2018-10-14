package com.bootcamp.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sanchit on 14/10/18
 */
@RequestMapping("/")
@Controller
public class TagsController {

    /*A thymeleaf namespace is also being declared for th:* attributes:
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">

---------------------
If we open a meta tag then we must have to close it (In html not necessary to close the meta tag)
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

*/


    /*<p th:text=”${test}”>test value</p>
     */
    public String modelAttribute(Model model) {
        model.addAttribute("test", "test success");
        return "modelAttribute";
    }

    @GetMapping("if")
    public String ifCondition() {
       /*
        <div th:if="${2 == 3} == false">
           Should be display.1
        </div>

        Here ‘SpringEL engine’ take care of the condition
        <div th:if="${true}">
           Should be display.2
        </div>

        <div th:if="${2==2} == false">
           Should not be display.1
        </div>

        <div th:if="${false}">
           Should not be display.2
        </div>

       * */
        return "if";
    }

    @GetMapping("forEach")
    public String forEach() {
        /*
        * <table>
                <tr th:each="prod, iterStat : ${({1,2,3})}" class="row" th:classappend="${iterStat.odd}? 'odd'">
                    <td th:text="${prod}">.</td>
                </tr>
           </table>

        * */
        return "forEach";
    }

    @GetMapping("unless")
    public String unless() {
        /*
        * <a th:href="@{/product/comments(prodId=${prod.id})}"
  th:if="${not #lists.isEmpty(prod.comments)}">view</a>

th:unless is counter to th:if

<a th:href="@{/comments(prodId=${prod.id})}"
  th:unless="${#lists.isEmpty(prod.comments)}">view</a>

        * */
        return "unless";
    }

    @GetMapping("includeVSreplace")
    public String includeVSreplace() {
        /*
        <div th:include="..."> content here </div>
fragment will be placed inside <div> tag.

However when you use replace:

<div th:replace="..."> content here </div>
then <div> will be replaced by content.

Thymeleaf can include parts of other pages as fragments (whereas JSP only includes complete pages) using th:include (will include the contents of the fragment into its host tag) or th:replace (will actually substitute the host tag by the fragment’s).
        * */
        return "hello";
    }


}
