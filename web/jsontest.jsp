<%--
  Created by IntelliJ IDEA.
  User: 13578
  Date: 2022/4/28
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
<script>
    var user = {id:1,age:18,name:"张三",say:function (){
        alert("haha");
    }}
    alert(user.id);
    alert(user.name);
    alert(user.age);
    user.say();

    var arr = [
        {id:2,name:"李四",age:19},
        {id:3,name:"王五",age:20},
    ];
    for (var i = 0; i < arr.length; i++) {
        alert(arr[i].name + "--" + arr[i].age);
    }

</script>
</html>
