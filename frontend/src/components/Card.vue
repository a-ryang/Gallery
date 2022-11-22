<template>
  <div class="card shadow-sm">
    <img :src="item.imgPath" alt="" />

    <div class="card-body">
      <p class="card-text">
        {{ item.name }}
        <small class="discount badge bg-danger">
          {{ item.discountPer }}%
        </small>
      </p>
      <div class="d-flex justify-content-between align-items-center">
        <button class="btn btn-primary">구입하기</button>
        <small class="price text-muted">
          {{ lib.getNumberFormatted(item.price) }}원
        </small>
        <small class="real text-danger text-musted">
          {{ item.price - (item.price * item.discountPer) / 100 }}원
        </small>
      </div>
    </div>
  </div>
</template>

<script>
import lib from "@/scripts/libs";

export default {
  name: "Card",
  props: {
    item: Object,
  },
  setup() {
    return { lib };
  },
};
</script>

<style scoped></style>
