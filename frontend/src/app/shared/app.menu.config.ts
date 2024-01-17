import { MenuRootItem } from "ontimize-web-ngx";

export const MENU_CONFIG: MenuRootItem[] = [
  { id: "home", name: "HOME", icon: "home", route: "/main/home" },
  {
    id: "subscriptions",
    name: "SUBSCRIPTIONS",
    icon: "subscriptions",
    route: "/main/subscriptions",
  },
  { id: "charts", name: "CHARTS", icon: "bar_chart", route: "/main/charts" },
  {
    id: "plans",
    name: "PLANS",
    icon: "event_note",
    route: "/main/plans",
  },
  {
    id: "categories",
    name: "CATEGORIES",
    icon: "category",
    route: "/main/categories",
  },
  {
    id: "platforms",
    name: "PLATFORMS",
    icon: "stream",
    route: "/main/platforms",
  },
  {
    id: "custom-platform",
    name: "CUSTOM_PLATFORMS",
    icon: "edit_note",
    route: "/main/custom-platform",
  },
  {
    id: "notice",
    name: "NOTICE",
    icon: "newspaper",
    route: "/main/notice",
  },
  {
    id: "notice-admin",
    name: "NOTICE_ADMIN",
    icon: "newspaper",
    route: "/main/notice-admin",
  },
  {
    id: "logout",
    name: "LOGOUT",
    route: "/login",
    icon: "power_settings_new",
    confirm: "yes",
  },
  // {
  //   id: "delete-account",
  //   name: "DELETE",
  //   icon: "person_remove",
  //   confirm: "yes",
  // },
];
