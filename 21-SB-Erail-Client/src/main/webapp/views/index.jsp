<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book your Ticket</title>
</head>
<body>

    <h1>Welcome to the Ticket Booking System</h1>
    
    <!-- Form should wrap all inputs -->
    <form action="ticket" method="post">
    
        <table>
            <tr>
                <td>First Name :</td>
                <td><input type="text" name="fname"></td>
            </tr>
            
            <tr>
                <td>Last Name :</td>
                <td><input type="text" name="lname"></td>
            </tr>
            
            <tr>
                <td>Source :</td>
                <td><input type="text" name="from"></td>
            </tr>
            
            <tr>
                <td>Destination :</td>
                <td><input type="text" name="to"></td>
            </tr>
            
            <tr>
                <td>Date of Journey :</td>
                <td><input type="date" name="doj"></td>
            </tr>
            
            <tr>
                <td>Train Number :</td>
                <td><input type="number" name="trainNo"></td>
            </tr>
            
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Book Ticket">
                </td>
            </tr>
        </table>
    </form>
    
    <a href="search.jsp">Search Your Tickets</a>
    
</body>
</html>
