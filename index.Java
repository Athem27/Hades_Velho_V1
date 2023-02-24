$("input[name=cep]").on("input", (e) => {
  let cep e.target.value
  
  if(cep.length == 8) {
    $.getJSON("https://viacep.com.br/ws/" + cep + "/json",
    function(dados) {
      console.log(dados)
      if(!("error"in dados)){
     
        $("#rua").val(dados.logradouro);
        $("#bairro").val(dados.bairro);        
        $("#cidade").val(dados.localidade);        
        $("#uf").val(dados.uf);
      }else(
        alert("cep não encontrado.");
    }
    )
  };
});