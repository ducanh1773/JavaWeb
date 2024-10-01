<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Simple Calculation</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <style>
            /* CSS cho các nút */
            .btn {
                padding: 10px 20px;
                font-size: 16px;
                margin: 5px;
                border: none;
                cursor: pointer;
            }

            /* Màu nền cho các nút */
            .btn-success { background-color: green; color: white; }
            .btn-primary { background-color: blue; color: white; }
            .btn-warning { background-color: orange; color: white; }
            .btn-danger { background-color: red; color: white; }

            /* Khởi tạo kích thước font */
            .resizable { font-size: 16px; }

            /* Màu đỏ cho chữ */
            .red-text { color: red; }
        </style>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h2 id="text">Nguyễn Trần Đức Anh</h2>

        <!-- Buttons -->
        <button class="btn btn-success resizable" onclick="resizeText(1.2)">Phóng To Chữ</button>
        <button class="btn btn-primary resizable" onclick="resizeText(0.8)">Thu Nhỏ Chữ</button>
        <button class="btn btn-warning" onclick="changeTextColor()">Đổi Màu Chữ Thành Đỏ</button>
        <button class="btn btn-danger" onclick="resetText()">Reset Chữ</button>

        <script>
            // Hàm để phóng to và thu nhỏ chữ
            function resizeText(scale) {
                const textElement = document.getElementById('text');
                let currentSize = window.getComputedStyle(textElement).fontSize;
                let newSize = parseFloat(currentSize) * scale;
                textElement.style.fontSize = newSize + 'px';
            }

            // Hàm để đổi màu chữ thành đỏ
            function changeTextColor() {
                const textElement = document.getElementById('text');
                textElement.classList.add('red-text');
            }

            // Hàm để đặt lại kích thước và màu chữ
            function resetText() {
                const textElement = document.getElementById('text');
                textElement.style.fontSize = '16px';  // Kích thước mặc định
                textElement.classList.remove('red-text'); // Xóa màu chữ đỏ
            }
        </script>
    </body>
</html>
