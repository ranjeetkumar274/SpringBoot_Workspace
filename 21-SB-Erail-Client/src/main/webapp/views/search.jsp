<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Get Your Ticket info</h2>

<form action="search" >
    Enter PNR Number : <input type="number" name="pnr">
    <input type="submit" value="Search Ticket">
    </form>
    
    <a href="/">Book New Ticket</a>
    
    <br><br>
    <div class="ticket">
    <h2>TRAIN TICKET</h2>
    <div class="pnr">PNR : ${ticket.pnr}</div>
    
    <table>
        <tr>
            <td>From</td>
            <td>${ticket.from}</td>
        </tr>
        <tr>
            <td>To</td>
            <td>${ticket.to}</td>
        </tr>
        <tr>
            <td>Date of Journey</td>
            <td>${ticket.doj}</td>
        </tr>
        <tr>
            <td>Train Number</td>
            <td>${ticket.trainNo}</td>
        </tr>
    </table>
    <span style="display:block; height:20px;"></span>

<a href="/">Book New Ticket</a>
<span style="display:block; height:10px;"></span>
<a href="search">Search A Ticket</a>
</div>
    
    

</body>
</html>