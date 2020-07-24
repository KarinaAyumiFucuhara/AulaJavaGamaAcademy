function gerarRelEventos(event) {

    event.preventDefault(); //não permite o envio padão do formulário
    let dataInicio = document.getElementById("inicio").value;
    let dataFim = document.getElementById("fim").value;

    //mudar para inicio e fim
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

    //alterar o BE
    fetch("http://localhost:8080/login", cabecalho)
        .then(res => tratarResposta(res));

}

/* function carregarDados() {
    fetch("http://localhost:8080/usuarios")
        .then(res => res.json())
        .then(res => exibirDados(res));
} */

/* function exibirDados(res) {
    let tabelaTxt = "<table class = 'table table-sm'> <tr> <th>Nome</th> <th>Nome</th> <th>Racf</th> </tr>"

    res.forEach(user => {
        tabelaTxt = tabelaTxt + `<tr> <td>${user.nome}</td> 
                                    <td>${user.email}</td>
                                    <td>${user.racf}</td></tr>`
    });
    tabelaTxt = tabelaTxt + "</table>";

    document.getElementById("tabela").innerHTML = tabelaTxt;
} */

function testeBotao() {
    let dataInicio = document.getElementById("inicio").value;
    let dataFim = document.getElementById("fim").value;
    console.log(dataInicio + " "+ dataFim);

    let tabelaTxt = "<table class = 'table table-sm'> <tr> <th>Data</th> <th>Alarme</th> <th>Equipamento</th> </tr>"
    document.getElementById("tabela").innerHTML = tabelaTxt;
}
