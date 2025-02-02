package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,152);
if (RapidSub.canDelegate("completejob")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 152;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 156;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(134217728);
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 157;BA.debugLine="If job = Null Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("n",_job)) { 
 BA.debugLineNum = 158;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
Debug.ShouldStop(536870912);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11572870",RemoteObject.concat(RemoteObject.createImmutable("HttpUtils2Service: job completed multiple times - "),_taskid),0);
 BA.debugLineNum = 159;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 161;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.ShouldStop(1);
httputils2service._taskidtojob.runVoidMethod ("Remove",(Object)((_taskid)));
 BA.debugLineNum = 162;BA.debugLine="job.success = success";
Debug.ShouldStop(2);
_job.setField ("_success" /*RemoteObject*/ ,_success);
 BA.debugLineNum = 163;BA.debugLine="job.errorMessage = errorMessage";
Debug.ShouldStop(4);
_job.setField ("_errormessage" /*RemoteObject*/ ,_errormessage);
 BA.debugLineNum = 165;BA.debugLine="job.Complete(TaskId)";
Debug.ShouldStop(16);
_job.runClassMethod (b4a.example.httpjob.class, "_complete" /*RemoteObject*/ ,(Object)(_taskid));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,115);
if (RapidSub.canDelegate("hc_responseerror")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 115;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
Debug.ShouldStop(1048576);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11507330",(RemoteObject.concat(RemoteObject.createImmutable("ResponseError. Reason: "),httputils2service.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reason))),RemoteObject.createImmutable(", Response: "),httputils2service.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_response.runMethod(true,"getErrorResponse")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 119;BA.debugLine="Response.Release";
Debug.ShouldStop(4194304);
_response.runVoidMethod ("Release");
 BA.debugLineNum = 120;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(8388608);
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 121;BA.debugLine="If job = Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_job)) { 
 BA.debugLineNum = 122;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
Debug.ShouldStop(33554432);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11507335",RemoteObject.concat(RemoteObject.createImmutable("HttpUtils2Service (hc_ResponseError): job completed multiple times - "),_taskid),0);
 BA.debugLineNum = 123;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 125;BA.debugLine="job.Response = Response";
Debug.ShouldStop(268435456);
_job.setField ("_response" /*RemoteObject*/ ,_response);
 BA.debugLineNum = 126;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_response.runMethod(true,"getErrorResponse"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 127;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
Debug.ShouldStop(1073741824);
_completejob(_taskid,httputils2service.mostCurrent.__c.getField(true,"False"),_response.runMethod(true,"getErrorResponse"));
 }else {
 BA.debugLineNum = 129;BA.debugLine="CompleteJob(TaskId, False, Reason)";
Debug.ShouldStop(1);
_completejob(_taskid,httputils2service.mostCurrent.__c.getField(true,"False"),_reason);
 };
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,92);
if (RapidSub.canDelegate("hc_responsesuccess")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 92;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(268435456);
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 94;BA.debugLine="If job = Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("n",_job)) { 
 BA.debugLineNum = 95;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
Debug.ShouldStop(1073741824);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11376259",RemoteObject.concat(RemoteObject.createImmutable("HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "),_taskid),0);
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 98;BA.debugLine="job.Response = Response";
Debug.ShouldStop(2);
_job.setField ("_response" /*RemoteObject*/ ,_response);
 BA.debugLineNum = 99;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
Debug.ShouldStop(4);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = httputils2service.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(httputils2service._tempfolder),(Object)(BA.NumberToString(_taskid)),(Object)(httputils2service.mostCurrent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 103;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
Debug.ShouldStop(64);
_response.runVoidMethod ("GetAsynchronously",httputils2service.processBA,(Object)(BA.ObjectToString("response")),(Object)((_out.getObject())),(Object)(httputils2service.mostCurrent.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private hc As OkHttpClient";
httputils2service._hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TaskIdToJob As Map";
httputils2service._taskidtojob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 19;BA.debugLine="Public TempFolder As String";
httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private taskCounter As Int";
httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver_receive(RemoteObject _firsttime,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Receiver_Receive (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,58);
if (RapidSub.canDelegate("receiver_receive")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","receiver_receive", _firsttime, _startingintent);}
Debug.locals.put("FirstTime", _firsttime);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 58;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="Service_Create";
Debug.ShouldStop(134217728);
_service_create();
 };
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _response_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,107);
if (RapidSub.canDelegate("response_streamfinish")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","response_streamfinish", _success, _taskid);}
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 107;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="If Success Then";
Debug.ShouldStop(2048);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 109;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
Debug.ShouldStop(4096);
_completejob(_taskid,_success,RemoteObject.createImmutable(""));
 }else {
 BA.debugLineNum = 111;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
Debug.ShouldStop(16384);
_completejob(_taskid,_success,httputils2service.mostCurrent.__c.runMethod(false,"LastException",httputils2service.processBA).runMethod(true,"getMessage"));
 };
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,27);
if (RapidSub.canDelegate("service_create")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","service_create");}
 BA.debugLineNum = 27;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="TempFolder = File.DirInternalCache";
Debug.ShouldStop(268435456);
httputils2service._tempfolder = httputils2service.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache");
 BA.debugLineNum = 30;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 31;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
Debug.ShouldStop(1073741824);
httputils2service.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(httputils2service._tempfolder),(Object)(BA.ObjectToString("~test.test")),(Object)(RemoteObject.createImmutable("test")));
 BA.debugLineNum = 32;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
Debug.ShouldStop(-2147483648);
httputils2service.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(httputils2service._tempfolder),(Object)(RemoteObject.createImmutable("~test.test")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",httputils2service.processBA, e6.toString()); BA.debugLineNum = 34;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11048583",BA.ObjectToString(httputils2service.mostCurrent.__c.runMethod(false,"LastException",httputils2service.processBA)),0);
 BA.debugLineNum = 35;BA.debugLine="Log(\"Switching to File.DirInternal\")";
Debug.ShouldStop(4);
httputils2service.mostCurrent.__c.runVoidMethod ("LogImpl","11048584",RemoteObject.createImmutable("Switching to File.DirInternal"),0);
 BA.debugLineNum = 36;BA.debugLine="TempFolder = File.DirInternal";
Debug.ShouldStop(8);
httputils2service._tempfolder = httputils2service.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal");
 };
 BA.debugLineNum = 41;BA.debugLine="If hc.IsInitialized = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",httputils2service._hc.runMethod(true,"IsInitialized"),httputils2service.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 46;BA.debugLine="hc.Initialize(\"hc\")";
Debug.ShouldStop(8192);
httputils2service._hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 };
 BA.debugLineNum = 54;BA.debugLine="TaskIdToJob.Initialize";
Debug.ShouldStop(2097152);
httputils2service._taskidtojob.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,68);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","service_destroy");}
 BA.debugLineNum = 68;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,64);
if (RapidSub.canDelegate("service_start")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 64;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",2,httputils2service.processBA,httputils2service.mostCurrent,74);
if (RapidSub.canDelegate("submitjob")) { return b4a.example.httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);}
RemoteObject _taskid = RemoteObject.createImmutable(0);
Debug.locals.put("job", _job);
 BA.debugLineNum = 74;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",httputils2service._taskidtojob.runMethod(true,"IsInitialized"),httputils2service.mostCurrent.__c.getField(true,"False"))) { 
_service_create();};
 BA.debugLineNum = 79;BA.debugLine="taskCounter = taskCounter + 1";
Debug.ShouldStop(16384);
httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 80;BA.debugLine="Dim TaskId As Int = taskCounter";
Debug.ShouldStop(32768);
_taskid = httputils2service._taskcounter;Debug.locals.put("TaskId", _taskid);Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 82;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
Debug.ShouldStop(131072);
httputils2service._taskidtojob.runVoidMethod ("Put",(Object)((_taskid)),(Object)((_job)));
 BA.debugLineNum = 83;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 84;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
Debug.ShouldStop(524288);
httputils2service._hc.runVoidMethod ("ExecuteCredentials",httputils2service.processBA,(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(_taskid),(Object)(_job.getField(true,"_username" /*RemoteObject*/ )),(Object)(_job.getField(true,"_password" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 86;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
Debug.ShouldStop(2097152);
httputils2service._hc.runVoidMethod ("Execute",httputils2service.processBA,(Object)(_job.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(_taskid));
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}