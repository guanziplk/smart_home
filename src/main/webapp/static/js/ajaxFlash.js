$("#errReflash").click(function () {
    alert('aaa');
   $.ajax({
       type:"post",
       url:"/Appliance/error/errorFlash",
       async:true,
       success:function (data) {
           $("#reflash").html(data);
       },
       error:function (data) {
           alert("数据查找失败！");
       }
   })
});