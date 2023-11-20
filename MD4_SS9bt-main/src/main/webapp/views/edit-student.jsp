<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/10/2023
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Thay đổi thông tin sinh viên</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <h1 class="text-center">Thay đổi thông tin sinh viên</h1>
            <%--             action="<%=request.getContextPath()%> xử     --%>
            <form action="<%=request.getContextPath()%>/StudentServlet" method="post">
                <div class="form-group">
                    <label for="id">Mã sinh viên</label>
                    <input type="text" class="form-control" id="id" name="id" value="${student_edit.id}" readonly>
                </div>
                <div class="form-group">
                    <label for="name">Họ Và Tên sinh viên</label>
                    <input  type="text"  class="form-control" id="name" name="name" value="${student_edit.name}" >
                </div>
                <div class="form-group">
                    <label for="birthday">Ngày sinh</label>
                    <input type="date" class="form-control" id="birthday" name="birthday"  value="${student_edit.birthday}">
                </div>
                <div class="form-group">
                    <label for="">Chọn lớp</label>
                    <select class="form-control" name="classId" id="">
                        <c:forEach items="${list}" var="item">
                            <option value="${item.id}" ${student_edit.id == item.id?"selected":""}  >${item.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <input type="hidden" name="action" value="edit">
                <button type="submit" class="btn btn-outline-dark">Update</button>
            </form>
        </div>
    </div>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
