package com.mosoftvn.controller;

import com.mosoftvn.model.entity.ClassRoom;
import com.mosoftvn.model.service.ClassRoomService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClassRoomServlet", value = "/class")
public class ClassRoomServlet extends HttpServlet {
    private ClassRoomService classRoomService;
    @Override
    public void init() throws ServletException {
        classRoomService = new ClassRoomService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ClassRoom> classRooms = classRoomService.findAll();
        request.setAttribute("list",classRooms);
        request.getRequestDispatcher("views/class-room.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}