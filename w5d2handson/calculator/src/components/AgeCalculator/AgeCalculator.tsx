import React, {useState, useEffect} from 'react';


interface age{
        month: number,
        day: number,
        year: number,
        ageResult: string
    }
    export const AgeCalculator:React.FC = () => {

        const [age, setAge] = useState<age>({
            month: 0,
            day: 0,
            year: 0,
            ageResult: "fsdfdsf"
        });
        
        const handleChange = (e:React.ChangeEvent<HTMLInputElement>) => {
           
            setAge({
                ...age,
                [e.target.name]: e.target.value
            })
        }
        const handleClick = () => {
            console.log("inside calage function");
            var today = new Date();
            var agecal = today.getFullYear() - age.year;
            var m = today.getMonth() - age.month;
            if (m < 0 || (m === 0 && today.getDate() < age.day)) {
                agecal--;
            }
            setAge({
                ...age,
                ageResult: agecal.toString()
            })
      
         
        }
    
    function calAge(input:age):string
    {
        console.log("inside calage function");
            var today = new Date();
            var agecal = today.getFullYear() - input.year;
            var m = today.getMonth() - input.month;
            if (m < 0 || (m === 0 && today.getDate() < input.day)) {
                agecal--;
            }
            console.log(agecal)
            return agecal.toString();
        
    }
       
     return(
        <div>
            <h3>Enter Month:</h3>
            <input name="month" type="number" onChange={handleChange}  />
            <h3>Enter day</h3>
            <input name="day" type="number" onChange={handleChange}  />
            <h3>Enter year</h3>
            <input name="year" type="number" onChange={handleChange}  />
            <h3>You age is: {age.ageResult}</h3>
            <button onClick={handleClick}>Calculate Age</button>
            <br/>
            
        </div>
    );


    }
