function checkIfExist(arr: number[]): boolean {
    
for(let i:number=0;i<arr.length;i++){
  for(let j:number=0;j<arr.length;j++){
    if(i==j){continue}
    if(arr[i]==arr[j]*2){
      return true;
    }
  }
  
}

return false;


};