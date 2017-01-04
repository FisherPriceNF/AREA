$('.form').find('input, textarea').on('keyup blur focus', function (e) 
    { // Fonction callback.
      
      var $this = $(this), // Déclaration du variable.
          label = $this.prev('label'); // Déclaration du variable

    	  if (e.type === 'keyup') 
        {
      	   if ($this.val() === '') 
            {
              label.removeClass('active highlight');
            } 
            else 
            {
              label.addClass('active highlight');
            }
        } 
        else if (e.type === 'blur') 
        {
        	 if( $this.val() === '' ) 
           {
        		label.removeClass('active highlight'); 
    			 }
           else 
           {
    		    label.removeClass('highlight');   
    			 }   
        } 
        else if (e.type === 'focus') 
        {
            if( $this.val() === '' ) 
            {
        		label.removeClass('highlight'); 
    			   } 
            else if( $this.val() !== '' ) 
            {
    		    label.addClass('highlight');
    			  }
        }

    }
);

$('.tab a').on('click', function (e) 
    { // Fonction callback.
       
      e.preventDefault();
      
      $(this).parent().addClass('active');
      $(this).parent().siblings().removeClass('active');
      
      target = $(this).attr('href');

      $('.tab-content > div').not(target).hide();
      
      $(target).fadeIn(600);
      
    }
);
