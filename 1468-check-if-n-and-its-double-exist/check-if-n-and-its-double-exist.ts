function checkIfExist(arr: number[]): boolean {
    const map=new Map<number,number>();
for(let i:number=0;i<arr.length;i++){
  let x:number=arr[i];
  if(map.has(x*2)){
    return true;
  }
  if(x%2==0 && map.has(x/2)){return true}
  map.set(x,i)
  
  }
  return false


};