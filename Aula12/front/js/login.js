function fazerLogin(event) {

    event.preventDefault(); //não permite o envio padão do formulário
    let txtUser = document.getElementById("txtUser").value;
    let txtSenha = document.getElementById("txtSenha").value;

    let msgLogin = {
        email: txtUser,
        racf: txtUser,
        senha: txtSenha
    }

    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(msgLogin),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/login", cabecalho)
        .then(res => tratarResposta(res));

}

function tratarResposta(res) {
    if(res.status == 200){
        console.log("Achou");
        res.json().then(res => gravarUsuario(res))
    }else{
        document.getElementById("msgError").innerHTML = "<p>Login/Senha Inválido</p>";
    }
}

function gravarUsuario(res) {
    localStorage.setItem("userLogged", JSON.stringify(res))
    window.location = "dados.html"
}