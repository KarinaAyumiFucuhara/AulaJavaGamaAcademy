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

    //mudar o BE
    fetch("http://localhost:8080/login", cabecalho)
        .then(res => tratarResposta(res));

}


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

    let tabelaTxt = "<table class = 'table table-sm'> <tr> <th>Alarme</th> <th>Quantidade no período</th> </tr>"
    document.getElementById("tabela").innerHTML = tabelaTxt;
}
