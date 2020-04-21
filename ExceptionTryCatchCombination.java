1

try{
	}
catch(x e){  //valid

	}
	
2
	
try{

}
catch (X e){   //valid

}
catch(Y e){

}

3

try{

}
catch (X e){     // invaid

}
catch(X e){

}

4


try{

}
finally{   //valid

}

5
try{

}
catch(X e){
							//valid
}
try{

}catch(Y e){


}
6

try{

}
catch(X e){
							//valid
}
try{

}
finally{
}

7

try{
				//inavlid CE : try without catch
}

8

catch(X e){
							// invalid CE :catch without try
					
}
 9
finally{
						// invalid CE :catch without try

}

10

try{

}
finally{

}
catch(X e){			// invalid CE :catch without try

}

11

try{

}
Syso("hello");		// invalid CE :catch without try
catch(X e){

}

12

try{

}
catch(X e){

}
Syso("hello");  // invalid CE :catch without try

catch(Y e){
}

13

try{

}
catch(X e){

}
Syso("hello");  
finally{					 // invalid CE :finally without try

}


14

try{

	try{
	
	}catch(X e){			//valid 
	
}
catch(X e){

}

15

try{

		try{
									// inavlid CE :try without catch
		}
	
}catch(X e){

}

16

try{

}catch(X e){

	try{						// valid
	
	}finally{
	
	}
}catch(Y e){

}

17

try{

}catch(X e){
									//valid
}finally{

		try{
		
		}catch(X e){
		}
		
}

18

try{

}catch (X e){
							//inavlid

}finally{


}
finally{

}




19


//invalid    { } is mandatory

try
catch(X e){

}

20

try{

}catch(X e)

finally{

}

21


try{

}catch(X e){

}finally



