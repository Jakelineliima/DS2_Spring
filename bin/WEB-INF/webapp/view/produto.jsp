<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<br>
<br>
<br>

    <form action="" method="post">

        <label for="nome">NOME</label>
        <input type="text" name="nome">
        <br>
        <label for="valor">VALOR</label>
        <input type="text" name="valor">
        <br>
        <button method="salvar" name="salvar">Cadastrar</button>
    </form>
</body>
</html>