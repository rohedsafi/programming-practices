 function test() {
	     let bool = true;
		 if (bool) {
		    let x = 30;

		    var y = 40;
		    document.write("x = " + x + ", y = " + y + "<br/>");
		 }
		 // x can't be accessible here
         console.log("x = " + x);
		 console.log("y = " + y + "<br/>");
		}
      test();