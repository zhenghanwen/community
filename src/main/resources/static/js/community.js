
function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();

    if (!content){
        alert("不能回复空内容~~~~");
        return ;
    }
    $.ajax({
        type:"POST",
        url:"/comment",
        contentType:"application/json",
        data:JSON.stringify({
            "parentId":questionId,
            "content":content,
            "type":1
        }),
        success:function (response) {
            if (response.code==200){
                window.location.reload();
                $("#comment_section").hide();
            }else {
                if (response.code==2003){
                   var isAccepted= confirm(response.message);
                   if (isAccepted){
                       window.open("https://gitee.com/oauth/authorize?client_id=8c683c308369fe66014bb08f63346c2e85c9a48dd0d99539beb0739c1b2fe745&redirect_uri=http://localhost:8887/callback&response_type=code");
                       window.localStorage.setItem("closable", true);

                   }
                }
                alert(response.message);
            }
            console.log(response)
        },
        dataType:"json"
    });
    console.log(questionId);
    console.log(content);

}

