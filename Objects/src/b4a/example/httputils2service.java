package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ReceiverHelper;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends android.content.BroadcastReceiver{
		
    static httputils2service mostCurrent;
	public static BA processBA;
    private ReceiverHelper _receiver;
    private static boolean firstTime = true;
    public static Class<?> getObject() {
		return httputils2service.class;
	}
	@Override
	public void onReceive(android.content.Context context, android.content.Intent intent) {
        mostCurrent = this;
       
        if (processBA == null) {
           
		    processBA = new anywheresoftware.b4a.ShellBA(context, null, null, anywheresoftware.b4a.BA.SharedProcessBA.ModuleType.RECEIVER, "b4a.example.httputils2service");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
        }
         _receiver = new ReceiverHelper(this);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.httputils2service", processBA, _receiver, anywheresoftware.b4a.keywords.Common.Density);
		}
        processBA.setActivityPaused(false);
        BA.LogInfo("*** Receiver (httputils2service) Receive " + (firstTime ? "(first time)" : "") + " ***");
        anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
        iw.setObject(intent);
        processBA.raiseEvent(null, "receiver_receive", firstTime, iw);
        firstTime = false;
    }
	

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "completejob", false))
	 {return ((String) Debug.delegate(processBA, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("11572870","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("11507330",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("11507335","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4a.example.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("11376259","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(processBA,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Service_Create";
_service_create();
 };
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="TempFolder = File.DirInternalCache";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
anywheresoftware.b4a.keywords.Common.File.WriteString(_tempfolder,"~test.test","test");
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_tempfolder,"~test.test");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("11048583",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Log(\"Switching to File.DirInternal\")";
anywheresoftware.b4a.keywords.Common.LogImpl("11048584","Switching to File.DirInternal",0);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="TempFolder = File.DirInternal";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "response_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4a.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "submitjob", false))
	 {return ((String) Debug.delegate(processBA, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="End Sub";
return "";
}
}