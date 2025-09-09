<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Train Ticket</title>

<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f4f9;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
    }

    .ticket {
        background: #fff;
        border: 2px dashed #333;
        border-radius: 12px;
        padding: 20px 40px;
        width: 500px;
        box-shadow: 0 6px 12px rgba(0,0,0,0.15);
        position: relative;
    }

    .ticket:before, .ticket:after {
        content: '';
        position: absolute;
        top: 50%;
        transform: translateY(-50%);
        width: 20px;
        height: 20px;
        background: #f4f4f9;
        border: 2px solid #333;
        border-radius: 50%;
    }

    .ticket:before {
        left: -12px;
    }

    .ticket:after {
        right: -12px;
    }

    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #222;
        letter-spacing: 2px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    td {
        padding: 10px;
        font-size: 16px;
    }

    td:first-child {
        font-weight: bold;
        color: #444;
        text-transform: uppercase;
        letter-spacing: 1px;
    }

    td:last-child {
        color: #111;
    }

    .pnr {
        text-align: center;
        font-size: 18px;
        font-weight: bold;
        margin-bottom: 15px;
        padding: 10px;
        border: 1px solid #333;
        display: inline-block;
        border-radius: 6px;
        background: #e8f0fe;
    }
</style>
</head>
<body>

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
</div>

</body>
</html>
