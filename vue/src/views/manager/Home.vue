<template>
  <div>

    <div class="card" style="line-height: 30px">
      <div>欢迎您，<span style="color:dodgerblue;">{{ user.name }}</span> 祝您今天过得开心！</div>
    </div>

  </div>
</template>

<script setup>
  import request from "@/utils/request";
  const user = JSON.parse(localStorage.getItem('student-user') || '{}')
</script>
