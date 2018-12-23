<template>
  <div class="spinner">
  </div>
</template>

<script>

export default {
  name: 'Spinner'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
   .spinner {
      height: 50px;
      width: 50px;
      background-color: pink;
      -webkit-animation: spinner 5s infinite linear;
      animation: spinner 5s infinite linear;
   }
   
   @-webkit-keyframes spinner {
      0% { 
         -webkit-transform: perspective(180px) rotateX(0deg) rotateY(0deg);
         background-color: #F4D03F;
      }
      25% { 
         -webkit-transform: perspective(180px) rotateX(-180.1deg) rotateY(0deg);
         background-color: #52B3D9;
      }
      50% { 
         -webkit-transform: perspective(180px) rotateX(-180deg) rotateY(179.9deg);
         background-color: #EC644B;
      }
      75% { 
         -webkit-transform: perspective(180px) rotateX(-360deg) rotateY(179.9deg);
         background-color: #68C3A3;
      }
      100% { 
         -webkit-transform: perspective(180px) rotateX(-360deg) rotateY(360deg);
         background-color: #F4D03F;
      }
   }
   
   @keyframes spinner {
      0% { 
         transform: perspective(180px) rotateX(0deg) rotateY(0deg);
         -webkit-transform: perspective(180px) rotateX(0deg) rotateY(0deg);
         background-color: #F4D03F;
      }
      25% { 
         transform: perspective(180px) rotateX(-180.1deg) rotateY(0deg);
         -webkit-transform: perspective(180px) rotateX(-180.1deg) rotateY(0deg);
         background-color: #52B3D9;
      }
      50% { 
         transform: perspective(180px) rotateX(-180deg) rotateY(179.9deg);
         -webkit-transform: perspective(180px) rotateX(-180deg) rotateY(179.9deg);
         background-color: #EC644B;
      }
      75% { 
         transform: perspective(180px) rotateX(-180deg) rotateY(179.9deg);
         -webkit-transform: perspective(180px) rotateX(-360deg) rotateY(179.9deg);
         background-color: #68C3A3;
      }
      100% { 
         transform: perspective(180px) rotateX(0deg) rotateY(360deg);
         -webkit-transform: perspective(180px) rotateX(-360deg) rotateY(360deg);
         background-color: #F4D03F;
      }
}</style>
