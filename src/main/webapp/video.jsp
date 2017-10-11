<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>智游教育视频管理</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
 
    <![endif]-->

</head>
<body>

    <div class="container-fluid">

        <div class="row header-top">
            <div class="col-md-12">

                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation">
                        <a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">智游教育视频管理系统</a>
                    </li>
                    <li role="presentation">
                        <a href="<c:url value='/video.jsp'></c:url>">视频管理</a>
                    </li>
                    <li role="presentation">
                        <a href="<c:url value='/speaker.jsp'></c:url>">主讲人管理</a>
                    </li>
                    <li role="presentation">
                        <a href="<c:url value='/index.jsp'></c:url>">课程管理</a>
                    </li>
                    <li class="text-right">
                        <a href="#settings" class="text-right" role="tab" data-toggle="tab">
                            admin
                            <span class="text-right glyphicon glyphicon-log-in">退出</span>
                        </a>
                    </li>
                </ul>
            </div>

        </div>

        <div class="row header-mid">
            <div class="col-md-12">
                <h3 class="text-left">视频管理</h3>
            </div>
        </div>

        <div class="row header-nav container">


            <div class="col-md-6 modal-footer">
                <!-- 点击会弹出添加优惠券窗口 -->
                <button class="btn btn-default" type="button" disabled="disabled" id="deleteVideos" onclick="getVideoIds()">批量删除</button>
                <button class="btn btn-default" type="button" onclick="add()">添加</button>
				</div>
					<div class="col-md-6 modal-footer">
						<input type="text" id="videotitle" placeholder="标题">
                        <select id="buttonspeaker"><option value='0'>--选择老师--</option></select>
                       
                        <!-- <select id="buttonspeaker"></select>-->
                        <select id="buttoncourse"><option value='0'>--选择课程--</option></select>
                        
                    <button  class="btn btn-default" onclick="searchBy()">查询</button>
                    </div>
					
					
                  
				

			
            <table class="table .table-hover table-bordered" style="text-align: center;">
                <tr>
                    <th></th>
                    <th>序号</th>
                    <th>名称</th>
                    <th>介绍</th>
                    <th>讲师</th>
                    <th>时长</th>
                    <th>播放次数</th>
                    <th>编辑</th>
                    <th>删除</th>
                </tr>
            </table>
        </div>
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>

    </div>

    <!-- 添加  --=================================================================== -->

    <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="exampleModalLabel">添加视频信息</h4>
                </div>
                <div class="modal-body">
                    <form method="post">
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">视频标题</label>
                            <input type="text" class="form-control" id="title" placeholder="视频名称">
                            
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">主讲人</label>
                            <input type="text" list="speaker" class="form-control" id="speakerName"></input>
                            <datalist id='speaker'>
                            </datalist>
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">所属课程</label>
                            <input type="text" list="subject" class="form-control" id="courseName">
                            <datalist id='subject'>
                            </datalist>
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">视频时长(秒)</label>
                            <input type="text" class="form-control" id="duration">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">封面图片地址</label>
                            <input type="text" class="form-control" id="image">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">视频播放地址</label>
                            <input type="text" class="form-control" id="videoUrl">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">备注</label>
                            <input type="text" class="form-control" id="descriptor">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="alter()">保存</button>

                </div>
            </div>
        </div>
    </div>
    <!-- 编辑  修改====================================================================================== -->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="exampleModalLabel">修改视频信息</h4>
                </div>
                <div class="modal-body">
                    <form method="post">
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">视频标题</label>
                            <input type="text" class="form-control" id="title1">
                            
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">主讲人</label>
                            <input type="text" list="speaker" class="form-control" id="speakerName1"></input>
                            <datalist id='speaker'>
                            </datalist>
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">所属课程</label>
                            <input type="text" list="subject" class="form-control" id="courseName1">
                            <datalist id='subject'>
                            </datalist>
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">视频时长(秒)</label>
                            <input type="text" class="form-control" id="duration1">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">封面图片地址</label>
                            <input type="text" class="form-control" id="image1">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">视频播放地址</label>
                            <input type="text" class="form-control" id="videoUrl1">
                        </div>
                        <div class="form-group">
                            <label for="message-text" class="control-label">备注</label>
                            <input type="text" class="form-control" id="descriptor1">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" onclick="updateVideo(uId)">保存</button>

                </div>
            </div>
        </div>
    </div>
    

<!-- js==================================================================================================== -->

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>

    <script type="text/javascript">
      $(document).ready(function(){
        
        loadVideo(1);
          
    })
     
    function getQueryString(name) { 
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
       var r = window.location.search.substr(1).match(reg); 
       if (r != null) return unescape(r[2]); return null; 
} 
   
    //展示===================================
        var list=null;
    
        var datas=null;
        
function loadVideo(pageIndex){
	
	getbuttonCourse();
    getbuttonSpeaker();
    
        $.ajax({
        	
            type:'POST',
            //url:'http://192.168.183.130:8080/zy_video_cms/zy_video_cms/search',
            url:'http://47.95.201.10:8080/zyvideo/zy_video_cms/search',
            async:true,
            
            contentType : 'application/json;charset=utf-8',

            data : JSON.stringify({
                "pageIndex" :pageIndex
            }),

            dataType : 'json',

            success : function(data) {
                
                $(".content").empty();
                
                //alert(data.data.listCourses)
                
                datas=data;
                
                list=data.data.listVideo;
                
                $.each(list,function(index,obj){
                  
                    //alert(obj.id);
                    
                    $(".table").append("<tr class='content'><td>"+"<input id='checkbox' type='checkbox' onclick='clickCheckbox()' name='remove' value="+obj.id+">"+
                            "</td><td>"+(index+1)+
                            "</td><td>"+obj.name+
                           "</td><td>"+obj.descriptor+
                           "</td><td>"+obj.speakerName+
                           "</td><td>"+obj.duration+
                           "</td><td>"+obj.videoview+
                           "</td><td>"+"<a href='#'><button type='button' onclick='update("+index+")' class='glyphicon glyphicon-edit'></button></a>"+
                           "</td><td>"+"<a href='#'><button type='button' class='glyphicon glyphicon-trash' onclick='getVideoId("+obj.id+")'></button></a>"+
                           "</td></tr>"
                    );
                });
                
                //分页
                $(".pagination").empty("");
                
                // 2.2 向分页标签中追加页码
                
                // 2.2.1 追加上一页按钮，第一页禁用掉，pageIndex - 1
                $(".pagination").append("<li " + (data.data.count == 1 || pageIndex==1 ? "class='disabled'" : '') + "><a aria-label='Previous' onclick='loadVideo(" +(pageIndex-1)+ ")'><span aria-hidden='true'>&laquo;</span></a></li>");
                
                // 2.2.2 追加每一个页码
                for (var i = 1; i <= data.data.count; i++) {
                    $(".pagination").append("<li " + (data.data.pageIndex == i ? "class='active'" : '') + "><a aria-label='Previous' onclick='loadVideo(" + i + ")'>" + i + "</a></li>");
                }
                
                // 2.2.3 追加下一页按钮，最后一页禁用掉，pageIndex + 1
                $(".pagination").append("<li " + (data.data.count == 1 || pageIndex==data.data.count ? "class='disabled'" : '') + "><a aria-label='Next' onclick='loadVideo(" +(pageIndex + 1)+ ")'><span aria-hidden='true'>&raquo;</span></a></li>");
                
                
                },
                
                
               
            error : function(msg) {

                alert(JSON.stringify(msg));
            }
        });
      
    }
   
// 添加======================================================================
   function alter(){
        
        $.ajax({
        	
            type:'POST',
            //url:'http://192.168.183.130:8080/zy_video_cms/zy_video_cms/add',
            url:'http://47.95.201.10:8080/zyvideo/zy_video_cms/add',
            async:true,
            
            //或取输入框输入的数据
            
            contentType:'application/json',
            
            data:JSON.stringify({
            	
            	"name":$("#title").val(),
            	
            	"speakerName":$("#speakerName").val(),
            	
            	"courseTitle":$("#courseName").val(),
            	
            	"duration":$("#duration").val(),
            	
            	"image":$("#image").val(),
            	
            	"url":$("#videoUrl").val(),
            	
                "descriptor":$("#descriptor").val()
                }),
            
                //操作成功执行
            success:function(data){
                
                //根据controller返回的数据进行处理操作
                if(data.errorCode==0){
           
                    //重新加载页面
                    //loadCourse();
                    //隐藏窗口
                   /** $(".table").append("<tr class='content'><td>"+ $(".table tr").length+
                            
                            "</td><td>"+$("#title").val()+
                            "</td><td>"+$("#descriptor").val()+
                            "</td><td>"+"<a href='#'><span class='glyphicon glyphicon-edit'><span></a>"+
                            "</td><td>"+"<a href='#'><span class='glyphicon glyphicon-trash'><span></a>"+
                            "</td></tr>"
                    );*/
                     
                    //alert(data.message);
                    
                    
                 $('#addModal').modal('hide');
                }
                
                
            },
            error:function(msg){
                
                alert(JSON.stringify(msg));
            }
        });
        
    }   

//==================
    
    function add(){
        
        $.ajax({
            
            success:function(data){
                
                $('#addModal').modal({});
                
                getCourse();
                getSpeaker();
            }
            
        })
    }
    //动态变化 删除
    
    function clickCheckbox() {

           var inputs = $("input[name='remove']:checked");
           
           var length = inputs.length;
           
           if (length == 0) {
               
                 $("#deleteVideos").html("批量删除");
                 $("#deleteVideos").attr("disabled", "disabled");
           }else {
                 $("#deleteVideos").html("批量删除（" +  length + "）");
                 $("#deleteVideos").removeAttr("disabled");
           }
       }
     //=================批量删除
    
    //获取id
    function getVideoIds(){
        
        //alert("我被点了");
        
        var checkbox = $("input[name='remove']:checked");
        
        var videoIds = new Array();
        
        var indexs = new Array();
        checkbox.each(function() {
            // $(this) 遍历中的每一个元素
            // alert($(this).val());
            // 获取选中的索引 h.index
            
            var index = $(this).val();
            
            //alert(index);
            
            // alert(JSON.stringify(coupons[index]));
            // index 从 1 开始，实际上第一个优惠券在数组中的索引是 0
            videoIds.push(index);
            // 索引数组
            //indexs.push(index);
            
            deleteVideo(videoIds);
            
         // 重置批量删除按钮状态
            $("#deleteVideos").html("批量删除");
            $("#deleteVideos").attr("disabled", "disabled");
            
       });

        
    }
    
    //单个删除操作
    function getVideoId(id){
        
        //alert("我被点了");
        
        //alert(id);
        
        var videoIds = new Array();
        videoIds.push(id);
         deleteVideo(videoIds);   
    }
    
    //删除操作
    function deleteVideo(videoIds){
        
        $.confirm({
            title: '警告',
            content: '确定删除吗？',
            type: 'red',
            buttons: {   
                ok: {
                    text: "确定",
                    btnClass: 'btn-primary',
                    keys: ['enter'],
                    action: function(){
        
        $.ajax({
        	
            type:'POST',
            //url:'http://192.168.183.130:8080/zy_video_cms/zy_video_cms/delete',
            url:'http://47.95.201.10:8080/zyvideo/zy_video_cms/delete',
            async:true,
            
            contentType : 'application/json;charset=utf-8',

            data : JSON.stringify({
               "videoIds":videoIds
        }),

            dataType : 'json',

            success : function(data) {
             
                 $(".content").empty();
                 
                 //alert(datas.data.pageIndex);
                 
                 loadVideo(datas.data.pageIndex);
                 
                 
                // alert(data.message);
                
            },

            error : function(msg) {

                alert(JSON.stringify(msg));
            }
        });
                    }
                },
                cancel: function(){
                    
                }
            }
        }); 
                
    }
    
    
    // 输入下拉框
    
    function getCourse(){
        
        //alert("我被触发了");
        
            $.ajax({
            	
            type:'GET',
           // url:'http://192.168.183.130:8080/zy_video_cms/zy_course_cms/searchName',
            url:'http://47.95.201.10:8080/zyvideo/zy_course_cms/searchName',
            async:true,
            dataType : 'json',
            success:function(data){
                
                //循环加载数据
                
                $("#subject").empty();
                
                var list=data.data.listCourses;
                
                $.each(list,function(index,obj){
                    //.calss 取值?
                            //列表中增加新的一行
                            
                  // alert(obj.title);
                    $("#subject").append(
                            
                            "<option>"+obj.title+"</option>"
                            
                    );
                })
                
            },
            error:function(msg){
                
                alert(JSON.stringify(msg));
            }
        });
        
    }
    
//主讲人下拉框
					function getSpeaker() {

						//alert("我被触发了");

						$.ajax({
							
									type : 'GET',
									//url : 'http://192.168.183.130:8080/zy_video_cms/zy_speaker_cms/searchName',
									url : 'http://47.95.201.10:8080/zyvideo/zy_speaker_cms/searchName',
									async : true,
									dataType : 'json',
									success : function(data) {

										//循环加载数据

										$("#speaker").empty();
										
										var list=data.data.listSpeaker;

										$.each(list, function(index, obj) {
											//.calss 取值?
											//列表中增加新的一行

											 //alert(obj.name);
											$("#speaker").append(

													"<option>" + obj.name+ "</option>"
															

											);
										})

									},
									error : function(msg) {

										alert(JSON.stringify(msg));
									}
								});

					}
					//按钮，主讲人，下拉框============================================================================
					function getbuttonSpeaker() {

                        //alert("我被触发了");

                        $.ajax({
                                    type : 'GET',
                                    //url : 'http://192.168.183.130:8080/zy_video_cms/zy_speaker_cms/searchName',
                                    url : 'http://47.95.201.10:8080/zyvideo/zy_speaker_cms/searchName',
                                    async : true,
                                    dataType : 'json',
                                    success : function(data) {

                                        //循环加载数据

                                        //$("#buttonSpeaker").empty();
                                        
                                        var list=data.data.listSpeaker;

                                        $.each(list, function(index, obj) {
                                            //.calss 取值?
                                            //列表中增加新的一行

                                             
                                             $("#buttonspeaker").append(
                                            		 
                                            		
                                            		 "<option value='"+obj.id+"'>" + obj.name +"</option>"
                                             
                                             );
                                        })

                                    },
                                    error : function(msg) {

                                        alert(JSON.stringify(msg));
                                    }
                                });

                    }
					//按钮，学科，下拉框============================================================================
						
					function getbuttonCourse(){
        
        //alert("我被触发了");
        
            $.ajax({
            	
            type:'GET',
            //url:'http://192.168.183.130:8080/zy_video_cms/zy_course_cms/searchName',
            url:'http://47.95.201.10:8080/zyvideo/zy_course_cms/searchName',
            async:true,
            dataType : 'json',
            success:function(data){
                
                //循环加载数据
                
                //$("#buttonCourse").empty();
                
                var list=data.data.listCourses;
                
                $.each(list,function(index,obj){
                    //.calss 取值?
                            //列表中增加新的一行
                            
                  // alert(obj.title);
                    $("#buttoncourse").append(
                            
                            "<option value='"+obj.id+"'>"+obj.title+"</option>"
                            
                    );
                })
                
            },
            error:function(msg){
                
                alert(JSON.stringify(msg));
            }
        });
        
    }	
						
						
			function searchBy(){
				$.ajax({
					
		            type:'POST',
		            //url:'http://192.168.183.130:8080/zy_video_cms/zy_video_cms/searchBy',
		            url:'http://47.95.201.10:8080/zyvideo/zy_video_cms/searchBy',
		            async:true,
		            
		            //或取输入框输入的数据
		            
		            contentType:'application/json',
		            
		            data:JSON.stringify({

		                 "courseId":$("#buttoncourse").val(),
		                  "speakerId":$("#buttonspeaker").val(),
		                   "videoTitle":$("#videotitle").val()
		                
		                }),
		            
		                //操作成功执行
		            success:function(data){
		            	
		            	$(".pagination").empty("");
		            	 $(".content").empty();
		                 
		                 //alert(data.data.listCourses)
		                 
		                 
		                 
		                 var list1=data.data.listVideo;
		                 $.each(list1,function(index,obj){
		                     
		                     //alert(obj.id);
		                     
		                     $(".table").append("<tr class='content'><td>"+"<input id='checkbox' type='checkbox' onclick='clickCheckbox()' name='remove' value="+obj.id+">"+
		                             "</td><td>"+(index+1)+
		                             "</td><td>"+obj.name+
		                            "</td><td>"+obj.descriptor+
		                            "</td><td>"+obj.speakerName+
		                            "</td><td>"+obj.duration+
		                            "</td><td>"+obj.videoview+
		                            "</td><td>"+"<a href='#'><button type='button' onclick='update("+index+")' class='glyphicon glyphicon-edit'></button></a>"+
		                            "</td><td>"+"<a href='#'><button type='button' class='glyphicon glyphicon-trash' onclick='getVideoId("+obj.id+")'></button></a>"+
		                            "</td></tr>"
		                     );
		                 });
		                
		                
		            },
		            error:function(msg){
		                
		                alert(JSON.stringify(msg));
		            }
		        });
				
				
			}			
				
							
						
						
						
						
						
						
						
						
						
						
						
	//修改=================================================

					var uId = null;

					function update(id) {

						//alert(id);

						var video = list[id];

						//alert(course.subjectTitle);

						// alert(course.title);

						// alert(course.descriptor);

						$("#title1").val(video.name);
						$("#speakerName1").val(video.speakerName);
						
						$("#courseName1").val(video.courseTitle);
						$("#duration1").val(video.duration);
						$("#image1").val(video.image);
						$("#videoUrl1").val(video.url);
						$("#descriptor1").val(video.descriptor);
						

						uId = video.id; // 不需要展示，设置为隐藏的

						//$("#updateModal").modal();

						//=======
						//uId=id;

						$.ajax({

							success : function(data) {

								$('#updateModal').modal({});

								// alert(uId);

								getCourse();
				                getSpeaker();
							}

						})
					}

					function updateVideo(uId) {

						$.ajax({

									type : 'POST',
									//url : 'http://192.168.183.130:8080/zy_video_cms/zy_video_cms/update',
									url : 'http://47.95.201.10:8080/zyvideo/zy_video_cms/update',
									async : true,

									contentType : 'application/json;charset=utf-8',

									data : JSON.stringify({
										"id" : uId,
										"name" : $("#title1").val(),
										"speakerName" : $("#speakerName1").val(),
										
										"courseTitle" : $("#courseName1").val(),
										"duration":$("#duration1").val(),
										"image":$("#image1").val(),
										"url":$("#videoUrl1").val(),
										"descriptor":$("#descriptor1").val()
										
										
									}),

									dataType : 'json',

									success : function(data) {

										$(".content").empty();
										/**
										if(getQueryString("pageIndex")>1){
										    
										    loadCourse(getQueryString("pageIndex"));
										    
										}
										if(getQueryString("pageIndex")==null){
										    loadCourse(2);
										}*/

										$('#updateModal').modal('hide');

										loadVideo(datas.data.pageIndex);

										//  alert(data.message);

									},

									error : function(msg) {

										alert(JSON.stringify(msg));
									}
								});

					}
				</script>

</body>
</html>