<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Sample</title>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <style>
        .container {
            width: 500px;
            margin: 100px auto;
        }
        input {
            width: 300px;
            font-size: 18px;
            margin: 10px;
            padding: 10px;
        }
        .remove {
            width: 30px;
            height: 30px;
            font-size: 20px;
            background-color: tomato;
            color: white;
            border: none;
            border-radius: 15px;
        }
        #addRow, #getValues {
            width: 130px;
            height: 40px;
            font-size: 16px;
            background-color: lightseagreen;
            color: white;
            border: none;
            margin: 20px;
        }
        button:hover {
            cursor: pointer;
        }
        tr:hover {
            cursor: move;
        }
    </style>
</head>
<body>
<div class="container">
    <table>
        <tbody>
            <tr>
                <td><input type="text" name="name"></td>
                <td><button class="remove">-</button></td>
            </tr>
            <tr>
                <td><input type="text" name="name"></td>
                <td><button class="remove">-</button></td>
            </tr>
        </tbody>
    </table>
    <button id="addRow">+ Add</button>
    <button id="getValues">Get Values</button>
</div>
 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script>
var html = '<tr><td><input type="text" name="name"></td><td><button class="remove">-</button></td></tr>';
 
$(function() {
    $('tbody').sortable();
 
    $('#addRow').click(function(){
        $('tbody').append(html);
    });
 
    $(document).on('click', '.remove', function() {
        $(this).parents('tr').remove();
    });
 
    $('#getValues').click(function(){
        var values = [];
        $('input[name="name"]').each(function(i, elem){
            values.push($(elem).val());
        });
        alert(values.join(', '));
    });
});
</script>
</body>
</html>